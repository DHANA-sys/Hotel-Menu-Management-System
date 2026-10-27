package project1;
import java.util.*;
public class hotel {
		static Scanner sc=new Scanner(System.in);
		static int pay;
		static int finish;
		static int total;
		static int hotel;
		static double otp=Math.random()*99999+99999;
		static int res;
		static ArrayList<String> food=new ArrayList<>();
		static ArrayList<Integer> quan=new ArrayList<>();
		static ArrayList<Integer> amount=new ArrayList<>();
		public static void main(String[] args) {
			
			all();	
			
		}
		public static void all() {
			menu();
			System.out.println("Select Hotel:");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				ss();
				break;
			case 2:
				anjappar();
				break;
			case 3:
				kfc();
				break;
				
			case 4:
				pizza();
				break;
			case 5:
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
		
		
		
		public static void menu() {
			System.out.println("=========>>> SELECT YOUR HOTEL <<<=========");
			System.out.println("1. SS Hyderbad Biryani");
			System.out.println("2. Anjappar");
			System.out.println("3. KFC");
			System.out.println("4. Pizza Hut");
			System.out.println("5.Exit");
		}
		
		
		
		public static void ss() {
			hotel=1;
			System.out.println("======>>> WELCOME TO SS HYDERBAD <<<======");
			System.out.println("1.Mutton Biryani ₹250");
			System.out.println("2.Chicken Biryani ₹150");
			System.out.println("3.Chicken 65 ₹100");
			System.out.println("4.Veg Biryani ₹120");
			System.out.println("5.Prawn Biryani ₹ 300");
			System.out.println("6.Paper Chicken ₹130");
			System.out.println("7.Egg Biryani ₹120");
			System.out.println("8.Chicken Tikka ₹170");
			System.out.println("9.Chicken Lollipop ₹130");
			System.out.println("10.Kushka ₹100");
			System.out.println("11.Chicken Fried Rice ₹120");
			System.out.println("12.Chicken Noodles ₹120");
			System.out.println("13.Gopi 65 ₹100");
			System.out.println("14.Panner 65 ₹110");
			System.out.println("15.Bread Halwa  ₹50");
			System.out.println("16.Exit");
			System.out.println("Place Order:");
			int order=sc.nextInt();
			switch(order) {
			case 1:{
				foodOrder("Mutton Biryani",250);
				option();
				at();
//				otp();
				break;
			}
			case 2:{
				foodOrder("Chicken Biryani",150);
				option();
				at();
//				otp();
				break;
			}
			case 3:{
				foodOrder("Chicken 65",100);
				option();
				at();
//				otp();
				break;
			}
			case 4:{
				foodOrder("Veg Biryani",120);
				option();
				at();
//				otp();
				break;
			}
			case 5:{
				foodOrder("Prawn Biryani",300);
				option();
				at();
				break;
			}
			case 6:{
				foodOrder("Paper Chicken",130);
				option();
				at();
				break;
			}
			case 7:{
				foodOrder("Egg Biryani",120);
				option();
				at();
				break;
			}
			case 8:{
				foodOrder("Chicken Tikka",170);
				option();
				at();
				break;
			}
			case 9:{
				foodOrder("Chicken Lolipop",130);
				option();
				at();
				break;
			}
			case 10:{
				foodOrder("Kushka",100);
				option();
				at();
				break;
			}
			case 11:{
				foodOrder("Chicken Fried Rice",120);
				option();
				at();
				break;
			}
			case 12:{
				foodOrder("Chicken Noodles",120);
				option();
				at();
				break;
			}
			case 13:{
				foodOrder("Gopi 65",100);
				option();
				at();
				break;
			}
			case 14:{
				foodOrder("Panner 65",110);
				option();
				at();
				break;
			}
			case 15:{
				foodOrder("Bread Halwa",50);
				option();
				at();
				break;
			}
			case 16:{
				all();
				break;
			}
			default:
				System.out.println("Invalid Input");
			}
	 }
		
		
		  
		public static void anjappar() {
			hotel=2;
			System.out.println("======>>> WELCOME TO ANJAPPAR <<<======");
			System.out.println("1.Parotta ₹30");
			System.out.println("2.Meals ₹100");
			System.out.println("3.Rice ₹70");
			System.out.println("4.Dhosa ₹30");
			System.out.println("5.Grilled Chicken  ₹450");                                    
			System.out.println("6.Tandoori Chicken ₹400");
			System.out.println("7.Egg Biryani ₹120");
			System.out.println("8.Chicken Manchurian ₹150");
			System.out.println("9.Chicken Lollipop ₹130");
			System.out.println("10.Fish Fry ₹180");
			System.out.println("11.Anjappar Meals ₹200");
			System.out.println("12.Chicken Noodles ₹120");
			System.out.println("13.Veg Noodles ₹100");
			System.out.println("14.Panner 65 ₹110");
			System.out.println("15.Egg Podimas  ₹50");
			System.out.println("16.Exit");
			System.out.print("Place Order:");
			int order=sc.nextInt();
			switch(order) {
			case 1:{
				foodOrder("Parotta",30);
				option();
				at();
				break;
			}
			case 2:{
				foodOrder("Meals",100);
				option();
				at();
				otp();
				break;
			}
			case 3:{
				foodOrder("Rice",70);
				option();
				at();
				
				break;
			}
			case 4:{
				foodOrder("Dhosa",30);
				option();
				at();
				break;
			}
			case 5:{
				foodOrder("Grilled Chicken",3450);
				option();
				at();
				break;
			}
			case 6:{
				foodOrder("Tandoori Chicken",400);
				option();
				at();
				break;
			}
			case 7:{
				foodOrder("Egg Biryani",120);
				option();
				at();
				break;
			}
			case 8:{
				foodOrder("Chicken Manchurian",150);
				option();
				at();
				break;
			}
			case 9:{
				foodOrder("Chicken Lolipop",130);
				option();
				at();
				break;
			}
			case 10:{
				foodOrder("Fish Fry",180);
				option();
				at();
				break;
			}
			case 11:{
				foodOrder("Anjappar Meals",200);
				option();
				at();
				break;
			}
			case 12:{
				foodOrder("Chicken Noodles",120);
				option();
				at();
				break;
			}
			case 13:{
				foodOrder("Veg Noodles",100);
				option();
				at();
				break;
			}
			case 14:{
				foodOrder("Panner 65",110);
				option();
				at();
				break;
			}
			case 15:{
				foodOrder("Egg Podimas ",50);
				option();
				at();
				break;
			}
			case 16:{
				all();
				break;
			}
			default:
				System.out.println("Invalid Input");
			}
		}
		public static void kfc() {
			hotel=3;
			System.out.println("======>>> WELCOME TO KFC <<<======");
			System.out.println("1.Chicken Burger ₹150");
			System.out.println("2.Crispy Chicken ₹100");
			System.out.println("3.Zinger Burger ₹150");
			System.out.println("4.Classic Burger ₹150");
			System.out.println("5.Bucket Chicken  ₹450");                                    
			System.out.println("6.Chicken Strips ₹130");
			System.out.println("7.Chicken Popcorn ₹120");
			System.out.println("8.Chicken Wings ₹130");
			System.out.println("9.Franch Fries  ₹80");
			System.out.println("10.Peri Peri Chicken ₹180");
			System.out.println("11.Chicken Roll ₹150");
			System.out.println("12.Cheese Fries ₹120");
			System.out.println("13.Veg Burger ₹100");
			System.out.println("14.Lava Cake ₹100");
			System.out.println("15.Pepsi  ₹60");
			System.out.println("16.Exit");
			System.out.print("Place Order:");
			int order=sc.nextInt();
			switch(order) {
			case 1:{
				foodOrder("Chicken Burger",150);
				option();
				at();
				break;
			}
			case 2:{
				foodOrder("Crispy Chicken",100);
				option();
				at();
				break;
			}
			case 3:{
				foodOrder("Zinger Burger",150);
				option();
				at();
				break;
			}  
			case 4:{
				foodOrder("Classic Burger ",150);
				option();
				at();           
				break;
			}
			case 5:{
				foodOrder("Bucket Chicken",450);
				option();
				at();
				break;
			}
			case 6:{
				foodOrder("Chicken Strips",130);
				option();
				at();
				break;
			}
			case 7:{
				foodOrder("Chicken Popcorn ",120);
				option();
				at();
				break;
			}
			case 8:{
				foodOrder("Chicken Wings",130);
				option();
				at();
				break;
			}
			case 9:{
				foodOrder("Franch Fries",80);
				option();
				at();
				break;
			}
			case 10:{
				foodOrder("Peri Peri Chicken",180);
				option();
				at();
				break;
			}
			case 11:{
				foodOrder("Chicken Roll ",150);
				option();
				at();
				break;
			}
			case 12:{
				foodOrder("Cheese Fries",120);
				option();
				at();
				break;
			}
			case 13:{
				foodOrder("Veg Burger",100);
				option();
				at();
				break;
			}
			case 14:{
				foodOrder("Lava Cake",100);
				option();
				at();
				break;
			}
			case 15:{
				foodOrder("Pepsi ",60);
				option();
				at();
				break;
			}
			case 16:{
				all();
				break;
			}
			default:
				System.out.println("Invalid Input");
			}
		}

		public static void pizza() {
			hotel=4;
			System.out.println("======>>> WELCOME TO PIZZA HUT <<<======");
			System.out.println("1.Mexican ₹180");
			System.out.println("2.Veggie ₹150");
			System.out.println("3.Corn & Cheese ₹160");
			System.out.println("4.Farmhouse Pizza ₹280");
			System.out.println("5.Panner Makhani  ₹290");                                    
			System.out.println("6.Veg Exotica ₹230");
			System.out.println("7.BBQ Chicken Pizza ₹300");
			System.out.println("8. Spicy Chicken Pizza ₹320");
			System.out.println("9.Garlic Bread  ₹100");
			System.out.println("10.Potato Wedges ₹180");
			System.out.println("11.Chicken Wings ₹150");
			System.out.println("12.Double Pizza ₹250");
			System.out.println("13.Cheese Dip ₹50");
			System.out.println("14.Lava Cake ₹100");
			System.out.println("15.Pepsi  ₹60");
			System.out.println("16.Exit");
			System.out.print("Place Order:");
			int order=sc.nextInt();
			switch(order) {
			case 1:{
				foodOrder("Maxican",180);
				option();
				at();
				break;
			}
			case 2:{
				foodOrder("Veggie",150);
				option();
				at();
				break;
			}
			case 3:{
				foodOrder("Corn & Cheese",160);
				option();
				at();
				break;
			}  
			case 4:{
				foodOrder("Farmhouse Pizza ",280);
				option();
				at();           
				break;
			}
			case 5:{
				foodOrder("Panner Makhani",290);
				option();
				at();
				break;
			}
			case 6:{
				foodOrder("Veg Exotica",230);
				option();
				at();
				break;
			}
			case 7:{
				foodOrder("BBQ Chicken Pizza ",300);
				option();
				at();
				break;
			}
			case 8:{
				foodOrder("Spicy Chicken Pizza",320);
				option();
				at();
				break;
			}
			case 9:{
				foodOrder("Garlic Bread",100);
				option();
				at();
				break;
			}
			case 10:{
				foodOrder("Potato Wedges",180);
				option();
				at();
				break;
			}
			case 11:{
				foodOrder("Chicken Wings ",150);
				option();
				at();
				break;
			}
			case 12:{
				foodOrder("Double Pizza",250);
				option();
				at();
				break;
			}
			case 13:{
				foodOrder("Cheese Dip",50);
				option();
				at();
				break;
			}
			case 14:{
				foodOrder("Lava Cake",100);
				option();
				at();
				break;
			}
			case 15:{
				foodOrder("Pepsi ",60);
				option();
				at();
				break;
			}
			case 16:{
				all();
				break;
			
			}
			default:
				System.out.println("Invalid Input");
		}
		}
		
		public static void option() {

		    System.out.println("Select A Payment Method:");
		    System.out.println("1.Gpay");
		    System.out.println("2.Phone Pay");
		    System.out.println("3.Bharat Pay");
		    System.out.println("4.Exit");
		    System.out.println("Choose a Payment Option:");
		    pay = sc.nextInt();
		}
		
		 public static void repeat() {
			 System.out.println("1.ADD MORE FOOD");
			 System.out.println("2.FINISH ORDER");
			 
			 int sel=sc.nextInt();
			 if(sel==1) {
				switch(hotel) {
				case 1:{
					ss();
					break;
				}
				case 2:{
					anjappar();
					break;
				}
				case 3:{
					kfc();
					break;
				}
				case 4:{
					pizza();
					break;
				}
				}
			 } 
			 else if(sel==2) {
				totalBill();
				 option();
				 at();
			 }
			 else {
				 System.out.println("Invalid Input");
			 }
		 }
		public static void otp() {
			for(int i=1;i<=3;i++) {
				System.out.println("Enter Your OTP");
				res=(int)otp;
				System.out.println(res);
				int user= sc.nextInt();
				if(user==res) {
					System.out.println("OTP Success");
			            System.out.println("1. Order Again");
			            System.out.println("2. Exit");

			            System.out.println("Enter your choice:");
			            int choice = sc.nextInt();

			            switch (choice) {
			                case 1:{
			                    all();
			                    break;
			                }
			                case 2:{
			                    System.out.println("Thank You For Visiting");
			                    break;
			                }
			                default:
			                    System.out.println("Invalid choice");
			            }
				}
				else {
					System.out.println("Invalid OTP");
				}
				if(i==3) {
					 System.out.println("Your Attempt Over");
					 option();
					 at();
					 otp();
				}
			}
		}
		
		
		
		public static void foodOrder(String foodName,int price) {
			System.out.println("You Selected  " + foodName);
			System.out.println("Enter Quantity:" );
			int quantity=sc.nextInt();
			int totalItem=price*quantity;
			total+=totalItem;
			food.add(foodName);
			quan.add(quantity);
			amount.add(totalItem);
			System.out.println("Amount: " + total);
			repeat();
		}
		
		
		public static void totalBill() {
			System.out.println("========================>>> YOUR BILL <<<=======================");
			for(int i=0;i<food.size();i++) {
				System.out.println(food.get(i) + "  X  " + quan.get(i) + " = ₹ " + amount.get(i));
			System.out.println(">>>==========================================================<<<");
			
			
			}
			System.out.println("Toatal Amount: " + total);
			System.out.println("<<<==========================================================>>>");
		}
		
		
		
		public static void at() {

		    switch(pay) {

		    case 1:
		    	System.out.println("Selected Gpay");
		        for(int i=1; i<=3; i++) {

		            System.out.println("Enter Your Amount:");
		            int amount = sc.nextInt();
		            if(amount == total) {
		                System.out.println("Payment Successful");
		                otp();
		                break;
		            } 
		            else{
		                System.out.println("Enter valid amount");
		            }
		            if(i==3) {
		                System.out.println("Your Attempt Over");
		                option();
		                at();
		            }
		       
		        }
		        break;
		    case 2:
		    	System.out.println("Selected Phone Pay");
		        for(int i=1; i<=3; i++) {

		            System.out.println("Enter Your Amount:");
		            int amount = sc.nextInt();
		            if(amount == total) {
		                System.out.println("Payment Successful");
		                otp();
		                break;
		            } 
		            else{
		                System.out.println("Enter valid amount");
		            }
		            if(i==3) {
		                System.out.println("Your Attempt Over");
		                option();
		                at();
		            }
		        
		        }
		        break;
		    case 3:
		    	System.out.println("Selected Bharat Pay");
		        for(int i=1; i<=3; i++) {

		            System.out.println("Enter Your Amount:");
		            int amount = sc.nextInt();
		            if(amount == total) {
		                System.out.println("Payment Successful");
		                otp();
		                break;
		            } 
		            else{
		                System.out.println("Enter valid amount");
		            }
		            if(i==3) {
		                System.out.println("Your Attempt Over");
		                option();
		                at();
		            }
		        
		        }
		        break;
		    case 4:
		    	option();
		    	break;
		    default:
		    	System.out.println("Invalid Input");
		    }
		    
		  
		}
	}
