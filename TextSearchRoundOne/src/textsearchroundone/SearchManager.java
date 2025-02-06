/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textsearchroundone;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tristan/Fox
 * this class manages (or is supposed to manage) the classes 
 * that enable the program to function
 */
public class SearchManager {
    //possible variables?
    private String inputMain;
    private int wordNumber;
    
    //Default Constructor
    public SearchManager(){
        this.inputMain ="";
        this.wordNumber = 0;
    }
    //main constructor
    public SearchManager(String inputMain){
        this.inputMain = inputMain;
//        this.wordNumber = wordNumber;
    }
    //execute search for word
    public List<Match> executeSearch(){
        
    }
    
}
