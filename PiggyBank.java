// Milind Pathiyal

// Creates two piggybanks, one for daughter and another for son
//The following program adds money and spends money from piggybank
public class PiggyBank
   {
       private int pennies;
       private int nickels;
       private int dimes;
       private int quarters;
         //Pre: Resets the entire piggybank
         //Post: Piggybank begins with 0 change
       public PiggyBank()
       {
            pennies = 0;
            nickels = 0;
            dimes = 0;
            quarters = 0;
       }
         //Pre: There must be a given value for each unit
         //Post: For example, Daughter begins with 7 pennies, 3 nickels, 20 dimes, and 14 quarters
       public PiggyBank(int givenPennies, int givenNickels, int givenDimes, int givenQuarters)
       {
           pennies = givenPennies;
           nickels = givenNickels;
           dimes = givenDimes;
           quarters = givenQuarters;
       }
        //Pre: Pennies must be >= 0
        //Post: This adds the pennies deposit amount to the overall account
       public void addPennies(int pennies)
       {
           this.pennies += pennies;
       }
        //Pre: Nickels must be >= 0
        //Post: This adds the nickels deposit amount to the overall account
       public void addNickels(int nickels)
       {
          this.nickels += nickels;
       }
         //Pre: Dimes must be >= 0
         //Post: This adds the dimes deposit amount to the overall account
       public void addDimes(int dimes)
       {
           this.dimes += dimes;
       }
         //Pre: Quarters must be >= 0
         //Post: This adds the quarters deposit amount to the overall account  
       public void addQuarters(int quarters)
       {
           this.quarters += quarters;
       }
           
       public void addPile(int pennies, int nickels, int dimes, int quarters)
       {
        this.pennies += pennies;
        this.nickels += nickels;
        this.dimes += dimes;
        this.quarters += quarters;
       }
          //Pre: None
          //Post: returns pennies
       public int getPennies()
       {
           return this.pennies;
       }
         //Pre: None
         //Post: returns nickels
       public int getNickels()
       {
            return this.nickels;
       }
         //Pre: None
         //Post: returns dimes
       public int getDimes()
       {
           return this.dimes;
       }
         //Pre: None
         //Post: returns quarters
       public int getQuarters()
       {
           return this.quarters;
       }
         //Pre:At least one of the units cannoty be 0 to have remaining money in piggybank
         // Post: Converts total amount into pennies
       public int getValue()
       {
           int value = (pennies + nickels * 5 + dimes * 10 + quarters * 25);
           return value;
       }
         
       public void spend(double spend)
       {
           //Pre: Spend must be greater than 0
           //Converts value into pennies value
           spend *= 100;     
           while (spend > 0)
           {
           //Post: program smartly removes units from greatest value to least value
           if (spend >= 25 && quarters > 0)
           {
               spend -= 25;
               quarters--;
           }
             else if (spend >= 10 && dimes > 0)
           {
               spend -= 10;
               dimes--;
           }
             else if (spend >= 5 && nickels > 0)
           {
               spend -= 5;
               nickels--;
           }
            else if (spend >= 1 && pennies > 0)
           {
               spend-= 1;
               pennies--;
           }
 
       }
    }
}
/*
Son has 18 cents and daughter has 695
Daughter has 18 quarters
After spending 3.87 daughter now has 308
Daughter has 8 pennies
Daughter has 5 nickels
Daughter has 20 dimes
Daughter has 3 quarters
After emptying his bank, son now has 0 left
 */
    