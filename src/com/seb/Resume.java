package com.seb;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Resume {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Your Name:");
        String name=input.nextLine();
        System.out.println("Your E-Mail Adrress:");
        String email=input.nextLine();
        Person aperson  = new Person(name,email);
        aperson.setName(name);
        aperson.setEmail(email);

        System.out.println("Education\n ");

         String status="";

        ArrayList<Education> educations = new ArrayList<Education>();


        System.out.println("Education" );
        do {
            Education ed= new Education();
            System.out.println("Field Of Study:");
            String fieldofstudy = input.nextLine();

            System.out.println("Name of school");
            String nameofschool = input.nextLine();

            System.out.println("Year of Graduation:");
            String yearofgraduation = input.nextLine();
           // ed = new Education(fieldofstudy,nameofschool,yearofgraduation);
            ed.setNameofschool(nameofschool);
            ed.setField(fieldofstudy);
            ed.setYearofgrad(yearofgraduation);
            educations.add(ed);
            System.out.println("Do you have any other Education achievement?");
            status=input.nextLine();

        }while(status.equals("Yes"));


        String anyExperience="";
        ArrayList<Experience> experiences=new ArrayList<Experience>();

        do {
            Experience exp=new Experience();
            System.out.println("Experience\n");
            System.out.println("Position:");
            String position = input.nextLine();
            System.out.println("Company Name:");
            String companyName = input.nextLine();
            System.out.println("From Date:");
            String fromDate = input.nextLine();
            System.out.println("To Date");
            String toDate = input.nextLine();
            System.out.println("Duty:");
            String duty = input.nextLine();
            exp.setPosition(position);
            exp.setCompanyName(companyName);
            exp.setFromDate(fromDate);
            exp.setToDate(toDate);
            exp.setDuty(duty);
            experiences.add(exp);
            System.out.println("Do you have any other Experience? ");
            anyExperience=input.nextLine();

        }while(anyExperience.equals("Yes"));


        ArrayList<Skills> skills=new ArrayList<Skills>();

        String anySkills="";
        do {
            Skills ski=new Skills();
            System.out.println("Skills\n ");
            System.out.println("Skill:");
            String skill = input.nextLine();
            System.out.println("Level");
            String level = input.nextLine();
            skills.add(ski);
            ski.setSkills(skill);
            ski.setLevel(level);
            System.out.println("Any other Skills?");
            anySkills=input.nextLine();
        }while(anySkills.equals("Yes"));


 System.out.println(aperson.getName() + "\n" + aperson.getEmail() + "\n");
        System.out.println("Education");
        for(Education edu : educations) {
        System.out.println(edu.getField() + "\n" + edu.getNameofschool() + "," + edu.getYearofgrad());
        }
        for(Experience ex: experiences){
            System.out.println(ex.getPosition() + "\n" + ex.getCompanyName() + "," + "From " + ex.getFromDate() +
                    "-" + ex.getToDate() + "\n -" + "Duty: " + ex.getDuty());
        }
        for(Skills sk:skills){
            System.out.println(sk.getSkills() + "," + sk.getLevel());
        }





    }
}
