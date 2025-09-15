package com.workintech.developers;

public class HRManager extends Employee {

    private String[] juniorDevelopers = new String[10];
    private String[] midDevelopers = new String[10];
    private String[] seniorDevelopers = new String[10];


    public HRManager(int id, String name, double salary ) {
        super(id, name, salary );
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        if(juniorDevelopers[juniorDevelopers.length - 1] != null){
            System.out.println("No more space for Junior Developers");
            return;
        }else{int i = 0;
        while (juniorDevelopers[i] != null) {
            i++;
        }
        juniorDevelopers[i] = juniorDeveloper.getName();}
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        if(midDevelopers[midDevelopers.length - 1] != null){
            System.out.println("No more space for Mid Developers");
            return;
        }else{int i = 0;
        while (midDevelopers[i] != null) {
            i++;
        }
        midDevelopers[i] = midDeveloper.getName();}

    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        if(seniorDevelopers[seniorDevelopers.length - 1] != null){
            System.out.println("No more space for Senior Developers");
            return;
        }else{int i = 0;
        while (seniorDevelopers[i] != null) {
            i++;
        }
        seniorDevelopers[i] = seniorDeveloper.getName();}

    }

}
