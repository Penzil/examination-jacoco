package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
	
	
	@Test
	public void testMethodName1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testMethodName2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("bob", "Henriksson");
		assertEquals("The result should be 1", i, 0);
	}
	
	
	@Test
	public void testMethodName3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Martin", "Pålman");
		assertEquals("The result should be 1", i, 2);
	}

	@Test
	public void testMethodGender1(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be M", i, 0);
	}
	
	@Test
	public void testMethodGender2(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be F", i, 1);
	}
	
	@Test
	public void testMethodGender3(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnGender('X');
		assertEquals("The result should be F", i, 2);
	}
	
	@Test
	public void testMethodAge1(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnAge(12);
		assertEquals("The result should be M", i, 0);
	}
	@Test
	public void testMethodAge2(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnAge(52);
		assertEquals("The result should be M", i, 1);
	}
	
	@Test
	public void testMethodCity1(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("a");
		assertEquals("The result should be M", i, 0);
	}
	@Test
	public void testMethodCity2(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("b");
		assertEquals("The result should be M", i, 1);
	}
	@Test
	public void testMethodCity3(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("c");
		assertEquals("The result should be M", i, 2);
	}
	
	@Test
	public void testMethodCity4(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("d");
		assertEquals("The result should be M", i, 3);
	}
	
	@Test
	public void testMethodCity5(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("e");
		assertEquals("The result should be M", i, 4);
	}
	
	@Test
	public void testMethodCity6(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("f");
		assertEquals("The result should be M", i, 5);
	}
	
	@Test
	public void testMethodCity7(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("g");
		assertEquals("The result should be M", i, 6);
	}
	
	@Test
	public void testMethodCity8(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("h");
		assertEquals("The result should be M", i, 7);
	}
	
	@Test
	public void testMethodCity9(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("i");
		assertEquals("The result should be M", i, 8);
	}
	
	@Test
	public void testMethodCity10(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("j");
		assertEquals("The result should be M", i, 9);
	}
	
	@Test
	public void testMethodCity11(){
		Game game =  new Game();
		int i = game.calculateOutPutBasedOnHomeCity("k");
		assertEquals("The result should be M", i, 10);
	}
		
	@Test
	public void testBuildFinalString(){
		Game game = new Game();
		Conversor converser = new Conversor();
		ResultFromInputs resultfrominputs = new ResultFromInputs();
		game.buildFinalString("Martin", "Palman", resultfrominputs, converser);
	}
	@Test
	public void testRunGame(){
		Game game = new Game();
	}
		
	
	

}
