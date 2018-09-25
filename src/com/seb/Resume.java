package com.seb;


import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Scanner;

public class Resume {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Your Name:");
        String name = input.nextLine();
        System.out.println("Your E-Mail Adrress:");
        String email = input.nextLine();
        Person aperson = new Person(name, email);
        aperson.setName(name);
        aperson.setEmail(email);

        System.out.println("Education\n ");

        String status = "";


        ArrayList<Education> educations = new ArrayList<Education>();


        System.out.println("Education");
        do {
            Education ed = new Education();
            System.out.println("Field Of Study:");
            String fieldofstudy = input.nextLine();
            System.out.println("Name of school");
            String nameofschool = input.nextLine();
            System.out.println("Year of Graduation:");
            String yearofgraduation = input.nextLine();
            ed.setNameofschool(nameofschool);
            ed.setField(fieldofstudy);
            ed.setYearofgrad(yearofgraduation);
            educations.add(ed);
            System.out.println("Do you have any other Education achievement?");
            status = input.nextLine();

        } while (status.equalsIgnoreCase("Yes"));


        System.out.println("Experience\n");
        String anyExperience = "";

        ArrayList<Experience> experiences = new ArrayList<Experience>();

        do {
            Experience exp = new Experience();

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
            ArrayList<String> duties=new ArrayList<String>();
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


        System.out.println("Skills\n ");
        ArrayList<Skills> skills = new ArrayList<Skills>();
        String anySkills = "";
        do {
            Skills ski = new Skills();

            System.out.println("Skill:");
            String skill = input.nextLine();
            System.out.println("Level");
            String level = input.nextLine();
            skills.add(ski);
            ski.setSkills(skill);
            ski.setLevel(level);
            System.out.println("Any other Skills?");
            anySkills = input.nextLine();
        } while (anySkills.equalsIgnoreCase("Yes"));

        System.out.println("============================================================================================");
        System.out.println(aperson.getName() + "\n" + aperson.getEmail() + "\n\n");
        System.out.println("Education");
        for (Education edu : educations) {
            System.out.println(edu.getField() + ",\n" + edu.getNameofschool() + "," + edu.getYearofgrad()+"\n");
        }
        System.out.println("Experience");
        int count=1;
        for(int i=1;i<=experiences.size();i++){
          for (Experience ex : experiences) {
              System.out.println(ex.getPosition() + "\n" + ex.getCompanyName() + "," + "From " + ex.getFromDate() +
                      "-" + ex.getToDate() + "\n -" + "Duty" + count + ex.getDuty());

          }
          count++;
        }
        System.out.println("Skills");
        for (Skills sk : skills) {
            System.out.println(sk.getSkills() + "," + sk.getLevel());
        }


    }
}
