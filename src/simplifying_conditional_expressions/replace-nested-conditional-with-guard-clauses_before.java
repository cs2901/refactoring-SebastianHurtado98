public double getPayAmount() {
  double result;
  result = normalPayAmount();
  if (isDead){
    result = deadAmount();
  }
    if (isSeparated){
      result = separatedAmount();
    }
  if (isRetired){
    result = retiredAmount();
  }

  return result;
}