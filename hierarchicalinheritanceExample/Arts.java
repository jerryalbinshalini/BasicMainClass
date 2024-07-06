package com.hierarchicalinheritanceExample;

public class Arts extends Student {
    int historymark;
    int geographymark;
    public void showArts(int historymark,int geographymark){
//        this.roll_no=2;
//        this.name="ammu";
        this.showStudent();
        System.out.println("History mark is:"+historymark);
        System.out.println("Geography mark is:"+geographymark);

    }
}
