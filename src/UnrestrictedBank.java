        public class UnrestrictedBank {
            private String accountNumber ;
            private String accountHolder;

            private double balance;

            public UnrestrictedBank(String maccountNumber, String naccountNumber, double mbalance){
                this.accountNumber = maccountNumber ;
                this.accountHolder = naccountNumber;
                this.balance = mbalance;
            }

            public String getAccountNumber() {
                return this.accountNumber;
            }

            public String getAccountHolder() {
                return this.accountHolder;
            }

            public double getBalance(){
                return this.balance;
            }

            public void deposit(double amount){
                this.balance = this.balance + amount;
            }

            public void withdraw(double amount) {
                 this.balance = this.balance - amount;
            }

            public static void main(String[] args )
            {
                UnrestrictedBank bank = new UnrestrictedBank("1234","Bektas", 1000);
                System.out.println(bank.getBalance());
                bank.deposit(200);
                System.out.println(bank.getBalance());
                bank.withdraw(500);
                System.out.println(bank.getBalance());
                System.out.println(bank.accountHolder);
                System.out.println(bank.accountNumber);



            }

        }
