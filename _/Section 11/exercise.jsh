double calculateResult(double startAmount, double interestRate, int years) {
for (int i=0; i< years ; i++) {
startAmount *= (interestRate+1);
System.out.println((i+1)+ " " +startAmount);
}
return startAmount;
}
calculateResult(10000,0.03,10);