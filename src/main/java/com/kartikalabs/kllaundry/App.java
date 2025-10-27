package com.kartikalabs.kllaundry;

import com.formdev.flatlaf.FlatLightLaf;
import com.kartikalabs.kllaundry.alert.FeedbackAlert;
import com.kartikalabs.kllaundry.form.BarangForm;
import com.kartikalabs.kllaundry.service.DatabaseService;
import com.kartikalabs.kllaundry.service.ErrorService;
import javax.swing.UIManager;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        try {
            
            
            FlatLightLaf.setup();
            UIManager.setLookAndFeel( new FlatLightLaf() );
            
            
            
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        ErrorService errorService = DatabaseService.migrate();
                        if (errorService.isError()) {
                            FeedbackAlert feedbackAlert = new FeedbackAlert();
                            feedbackAlert.setVisible(true);
                            feedbackAlert.setPesan(errorService.getMessage());
                            feedbackAlert.setTeknis(errorService.getLog());
                        } else {
                            new BarangForm().setVisible(true);
                        }
                        
                        
                    } catch (Exception e) {
                    }
//                    new BarangForm().setVisible(true);
                }
            });
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
