/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Interface.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class Actions {
    
    private String spz;
    private String date;
    private float speed;
    private DefaultTableModel model;
    private JFrame frame = new JFrame();
 
    
    public Actions() {
        frame.setVisible(true);
    }
    
    public Actions(String spz, String date, float speed) {
    this.spz = spz;
    this.date = date;
    this.speed = speed;
    
    }
    
    public String speeding() {
    
        if(this.speed > 90)
            return "Yes";
        else
            return "No";
        
    }
    
    public void Add(){
    
        
        model = (DefaultTableModel)frame.tbl_list.getModel();
        model.addRow(new Object[]{this.spz, this.date, this.speed, speeding()});
        
        frame.fungujestypico.setText("" + frame.tbl_list.getRowCount());
        frame.setVisible(true);
        }
    
    /**
     * @return the spz
     */
    public String getSpz() {
        return spz;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }


    /**
     * @return the speed
     */
    public float getSpeed() {
        return speed;
    }
    
}
