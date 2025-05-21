public class DemoController {

	@GetMapping
	public void getAllLoan() {
		System.out.println("DemoController:: getAllLoan()");
	}

	public void helloNong() {
		System.out.println("DemoController:: hello()");
	}
}