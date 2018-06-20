package main.practiceExercise;

public class StudentData {
    
    public boolean isInputVaild(int number) {
        if(number >= 0 && number <= 100) return true;
        
        return false;
    }
    
    public int maximumMarks(int marks[]) {
        int max=-1;
        for(int i=0;i<marks.length;i++) {
            
            if(isInputVaild(marks[i]) && marks[i]>max) {
                max = marks[i];
            }
        }        
        
        return max;
    }
    public int minimumMarks(int marks[]) {
        int min=10000;
        for(int i=0;i<marks.length;i++) {
            if(isInputVaild(marks[i]) && marks[i]<min) {
                min = marks[i];
            }
        }        
        return min;
}

    public float avgMarks(int marks[]) {
        float avg=0,sum=0;
        int cnt=0;
        for(int i=0;i<marks.length;i++) {
            if(isInputVaild(marks[i])) {
                sum+=marks[i];
                cnt++;
            }
        }
        avg = sum/cnt;
        return avg;
        }
}