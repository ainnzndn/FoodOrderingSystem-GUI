package FoodOrderSystem;

public class Controller {
		
		public void openUserMenu() {
			user_menu.UserMenu();
		}
		
		public void openUserLogin() {
			user_screen.UserLogin();
		}
		
		public void openSplashscreen() {
			splashscreen.Splashscreen();
		}
		
		public void openMenu() {
			menu.ScreenMenu();
		}
		
		public void openBurger() {
			panel_burger.ScreenBurger();
		}
		
		public void openPasta() {
			panel_pasta.ScreenPasta();
		}
		
		public void openPizza() {
			panel_pizza.ScreenPizza();
		}
		
		public void openCake() {
			panel_cake.ScreenCake();
		}
		
		public void openDrink() {
			panel_drink.ScreenDrink();
		}
		
		public void openPayMethod(double tot) {
			pay_method_screen.ScreenPayment(tot);
		}
	
		public void openFPXPayment(double tot) {
			pay_fpx_screen.FPXPayment(tot);
		}
		
		public void openFPX(double tot) {
			pay_login_screen.FPX(tot);
		}
		
		public void openPaymentBill(double tot) {
			pay_bill_screen.PaymentBill(tot);
		}
		
		public void openReview() {
			review.Review();
		}
		
		public void openListMenu() {
			list_frame.ListMenu();
		}
		
		public void openMenuList() {
			menu_list.MenuList();
		}
		
		public void openBankList() {
			bank_list.BankList();
		}
		
		public void openRestaurantList() {
			restaurant_list.RestaurantList();
		}
		
}
