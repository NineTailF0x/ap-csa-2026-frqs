
public int moreHistoryThanMathAbcences(){
    int count = 0;
    for (int i = 0; i < historyList.size(); i++){
        if(historyList[i].getStudentID().equals(mathList[i].getStudentID())){
            if(historyList[i].getAbcences() > mathList[i].getAbcences()){
                count ++;
            }
        }
    }
    return(count);
}
