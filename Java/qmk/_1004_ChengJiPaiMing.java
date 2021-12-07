import java.util.Scanner;

public class _1004_ChengJiPaiMing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudent = input.nextInt();

        _1004_StudentInfo[] studentInfoArray = new _1004_StudentInfo[numberOfStudent];
        String name,IDNum;
        int mark;

        for(int i=0; i<numberOfStudent;i++){
            name=input.next();
            IDNum=input.next();
            mark=input.nextInt();

            studentInfoArray[i]= new _1004_StudentInfo(name,IDNum,mark);
        }

        // top
        _1004_StudentInfo topStudent = studentInfoArray[0];
        _1004_StudentInfo lowStudent = studentInfoArray[0];
        for(int i=1; i<numberOfStudent;i++){
            if(topStudent.mark< studentInfoArray[i].mark)
                topStudent=studentInfoArray[i];
            if(lowStudent.mark>studentInfoArray[i].mark)
                lowStudent=studentInfoArray[i];
        }

        System.out.println(topStudent.name+" "+topStudent.IDNum);
        System.out.println(lowStudent.name+" "+lowStudent.IDNum);
    }
}

class _1004_StudentInfo {
    String name, IDNum;
    int mark;


    _1004_StudentInfo(String name, String IDNum, int mark){
        this.IDNum=IDNum;
        this.mark=mark;
        this.name=name;
    }
}
