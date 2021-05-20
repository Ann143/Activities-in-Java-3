/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Admin
 */
public class Name {
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String extension;
   
    //create your constructors and overload them
    //create your necessary setters and getters
    public Name(){
       
    }
    public Name(String title, String firstName, String middleName, String lastName, String extension){
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName =  lastName;
        this.extension = extension;
    }
   
    public Name(String title, String firstName, String middleName, String lastName){
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName =  lastName;
    }

   
   
   
    //setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    //getter
    public String getTitle(){
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getExtension() {
        return extension;
    }
   
   
    /**
     * Display name will print the name in the following format:
     * <title><first name><middle initial>.<last nme><extension>
     * Mr. Edrian B. Guanzon
     * Engr. Patrick Troy M. Elalto TT
     
     
     */
    /**override the string
     *
     */
   
   

    @Override
    public String toString(){
        return String.format("%s %s %s %s %s", this.title, this.firstName, this.middleName,  this.lastName, this.extension);
    }

    public void Display() {
        System.out.println( title + firstName + middleName + lastName);
    }
}
