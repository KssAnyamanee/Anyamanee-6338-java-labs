    /*
     * this class can store and tell you name, weight, height, gender, nationality, birthdate and can compare age
     * Author: Anyamanee Somsuk
     * ID: 653040633-8
     * sec: 1
     * Date: 20/01/2023
     */


package somsuk.anyamanee.lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Athlete {
        public enum Gender{FEMALE , MALE};
        protected String name;
        protected Double weight;
        protected Double height;
        public Gender gender;
        protected String nationality;
        protected LocalDate birthdate;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //format birthdate
        
        public String getName() {
            return this.name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public Double getWeight() {
            return this.weight;
        }
    
        public void setWeight(Double weight) {
            this.weight = weight;
        }
    
        public Double getHeight() {
            return this.height;
        }
    
        public void setHeight(Double height) {
            this.height = height;
        }
    
        public Gender getGender() {
            return this.gender;
        }
    
        public void setGender(Gender gender) {
            this.gender = gender;
        }
    
        public String getNationality() {
            return this.nationality;
        }
    
        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
    
        public LocalDate getBirthdate() {
            return this.birthdate;
        }
    
        public void setBirthdate(String birthdate) {
            this.birthdate = LocalDate.parse(birthdate, formatter);
        } 


        public String toString(){ //return in this pattern
            return ("Athlete " + "[" + name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", " + birthdate + "]");
        }

        public void compareAge(Athlete athlete){ //compare athlete's age
           
            int year = (int) ChronoUnit.YEARS.between(this.getBirthdate(), athlete.getBirthdate());
            
            if(year>0){
                System.out.println(this.getName() + " is " + year + " years older than " + athlete.getName());
            }else if(year<0){
                System.out.println(athlete.getName() + " is " +  Math.abs(year) + " years younger than " + this.getName());
            }else{
                System.out.println(athlete.getName() + " is as old as " + this.getName());
            }
        }

    
    
    
        public Athlete(String name,Double weight, Double height , Gender gender, String nationality, String birthdate){
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.gender = gender;
            this.nationality = nationality;
            this.birthdate = LocalDate.parse(birthdate, formatter);

    
        }
    
        
    }
    

