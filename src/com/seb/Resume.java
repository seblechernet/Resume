package com.seb;


import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Scanner;

public class Resume {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Ask the user for  personal information
        System.out.println("Your Name:");
        String name = input.nextLine();
        System.out.println("Your E-Mail Adrress:");
        String email = input.nextLine();

//  Create a new object called aperson of type(class) Person
        Person aperson = new Person(name, email);

//  Set the name and email variables to the new object aperson
        aperson.setName(name);
        aperson.setEmail(email);
//Ask the user for educational background

        System.out.println("Education\n ");
      //Declare a Sting variable anyEducation to use it in the condition for the do loop and initialize it to empty String,
     // if the user says yes for the question "do you have any other education achievement" then the loop continues

        String anyEducation = "";
//create a  new ArrayLis of the class type Education called educations

        ArrayList<Education> educations = new ArrayList<Education>();

        System.out.println("Education");
        do {
// Create a new object called ed of class type Education
            Education ed = new Education();
            System.out.println("Field Of Study:");
            String fieldofstudy = input.nextLine();
            System.out.println("Name of school");
            String nameofschool = input.nextLine();
            System.out.println("Year of Graduation:");
            String yearofgraduation = input.nextLine();

// Set the variables (nameofschool,fieldofstudy,yearofgraduation) to the new object ed
            ed.setNameofschool(nameofschool);
            ed.setField(fieldofstudy);
            ed.setYearofgrad(yearofgraduation);
// Add the new object ed to the educations which is  ArrayList of Class Education
            educations.add(ed);
// Ask the user if they have any other Education if yes the loop continues if no it will end

            System.out.println("Do you have any other Education achievement?");
            anyEducation = input.nextLine();

        } while (anyEducation.equalsIgnoreCase("Yes"));


        System.out.println("Experience\n");
        String anyExperience = "";

        ArrayList<Experience> experiences = new ArrayList<Experience>();

        do {
            Experience exp = new Experience();
            ArrayList<String> duties=new ArrayList<String>();
            System.out.println("Position:");
            String position = input.nextLine();
            System.out.println("Company Name:");
            String companyName = input.nextLine();
            System.out.println("From Date:");
            String fromDate = input.nextLine();
            System.out.println("To Date");
            String toDate = input.nextLine();
            exp.setPosition(position);
            exp.setCompanyName(companyName);
            exp.setFromDate(fromDate);
            exp.setToDate(toDate);
            String anyDuty = "";

            int count=1;
            do{

                System.out.println("Duty" + count+":");
                String duty=input.nextLine();
                duties.add(duty);
                System.out.println("Any other Duties?");
                anyDuty=input.nextLine();
                count ++;
            }while(anyDuty.equalsIgnoreCase("yes"));

             exp.setDuty(duties);

            experiences.add(exp);
            System.out.println("Do you have any other Experience? ");
            anyExperience = input.nextLine();

        } while (anyExperience.equalsIgnoreCase("yes"));

//Declare a Sting variable anySkills to use it in the condition for the do loop and initialize it to empty String,
// if the user says yes for the question "do you have any other Skills" then the loop continues

        System.out.println("Skills\n ");
        String anySkills = "";

    //create a  new ArrayLis of the class type Skills called skills
        ArrayList<Skills> skills = new ArrayList<Skills>();
        do {

   // Create a new object called ski of class type Skills
                    Skills ski = new Skills();

            System.out.println("Skill:");
            String skill = input.nextLine();
            System.out.println("Level");
            String level = input.nextLine();
    // Set the variables (skill and level) to the new object ski
            ski.setSkills(skill);
            ski.setLevel(level);

    // Add the new object ed to the educations which is  ArrayList of Class Education
            skills.add(ski);

     // Ask the user if they have any other Education if yes the loop continues if no it will end

            System.out.println("Any other Skills?");
            anySkills = input.nextLine();
        } while (anySkills.equalsIgnoreCase("Yes"));

        System.out.println("======================================================================================");


        System.out.println(aperson.getName() + "\n" + aperson.getEmail() + "\n\n");

        System.out.println("Education");
        for (Education edu : educations) {
            System.out.println(edu.getField() + ",\n" + edu.getNameofschool() + "," + edu.getYearofgrad()+"\n");
        }


        System.out.println("Experience");

          for (Experience ex : experiences) {
              System.out.println(ex.getPosition() + "\n" + ex.getCompanyName() + "," + "From " + ex.getFromDate() +
                      "-" + ex.getToDate()) ;
              for (String duty:ex.getDuty()){
                  System.out.println("- " + duty);
              }



          }



        System.out.println("Skills");
        for (Skills sk : skills) {
            System.out.println(sk.getSkills() + "," + sk.getLevel());
        }


    }
}
