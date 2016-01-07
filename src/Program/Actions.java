/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Interface.JFrame;
import zkouskovyprojekt.ZkouskovyProjekt;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.io.FileWriter;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Actions {
    
    private String spz;
    private String date;
    private float speed;
    private DefaultTableModel model;
    private JFrame frame;
    
    private FileWriter write;
    private static final String header = "SPZ, Date, Speed, Speeding";
    
    private Vector data;
    private Vector row;
    private List rows;
    
    private int help = 0;
    
    public Actions() {
        frame = new JFrame();
        frame.setVisible(true);
    }
    
    public String speeding(float speed) {
    
        if(speed > 90)
            return "Yes";
        else
            return "No";
        
    }
    
    public void Add(String spz, String date, float speed){
 
        model = (DefaultTableModel)frame.tbl_list.getModel();
        model.addRow(new Object[]{spz, date, speed, speeding(speed)});
        
        }
    
    public void Delete(int rowID) {
        model.removeRow(rowID);
    }
    
   /* public void Export(){
    
        try {
        write = new FileWriter("data.csv");
        write.append(header);
        data = model.getDataVector();
        rows = new ArrayList(frame.tbl_list.getRowCount());
        for (Object v : data){
        row = (Vector)data.elementAt(help);
        rows.add(row);
        help++;
        }
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        
    }*/
    
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
