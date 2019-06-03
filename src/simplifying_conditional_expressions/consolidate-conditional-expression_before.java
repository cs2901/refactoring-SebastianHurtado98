



boolean isNotEligableForDisability(){
    return (seniority < 2  || monthsDisabled > 12 || isPartTime);
        }



double disabilityAmount() {
  if (isNotEligableForDisability() ) {
    return 0;
  }
  // Compute the disability amount.
  // ...
}