public in getPointForRow(int targetRow){
  int total = 0;
  boolean same = false;
  for(int i = 0; i < board[targetRow].length();i++){
    total += board[targetRow][i].getPoints;
    if(!board[targetRow][i].getColor.equals(board[targetRow][0])){
      same = false;
    }
  }
  if(same == true){
    return(total * 2)
  } else {
    return(total)
  }
}
