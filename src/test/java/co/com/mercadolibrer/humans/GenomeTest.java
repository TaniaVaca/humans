package co.com.mercadolibrer.humans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import co.com.mercadolibrer.humans.model.entity.SequenceServicio;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HumansApplication.class)
public class GenomeTest {

	@Autowired
	SequenceServicio sequenceServicio;
	
	@Test
	@DisplayName("sequence-Get-AllTest")
	  void sequenceGetAllTest() {
		String resp= sequenceServicio.getStatusSequence();
		boolean expected = true;
		boolean current = resp != null;
		assertEquals(expected, current);
	  }
}
