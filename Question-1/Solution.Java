// Part A, Acount

public String Acount(String requestedName){
  private int num = 0
  while(isAvailible(requestedName) == false) {
    num ++;
    requestedName = requestedName + str(num);
  }
  return(requestedName);
}

// Part B, shorten

public String getShortenedName(String Name){
  private String shorten = "";
  private int last = 0;
  if (Name.indexOf("-") == -1){
    return(Name);
  } else {
    while(Name.indexOf("-") > -1){
      shorten += Name.subString(last,Name.indexOf("-") - 1);
      last = Name.indexOf("-");
    }
  }   
  return(shorten);
}
