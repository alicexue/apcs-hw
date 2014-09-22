//mixstart

public boolean mixStart(String str) {
  if (str.length()<3) return false;
  if (str.substring(1,3).equals("ix")) {
      return true;
  } else {
      return false;
  }   
}


// makeOutWord
public String makeOutWord(String out, String word) {
  return (out.substring(0,2)+word+out.substring(2,4));
}


// firstHalf
public String firstHalf(String str) {
   return str.substring(0,str.length()/2);
}
