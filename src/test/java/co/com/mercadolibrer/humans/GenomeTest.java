package co.com.mercadolibrer.humans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.com.mercadolibrer.humans.core.utils.Utils;
import co.com.mercadolibrer.humans.model.entity.Genome;
import co.com.mercadolibrer.humans.model.entity.GenomeRepository;
import co.com.mercadolibrer.humans.model.entity.GenomeServicio;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HumansApplication.class)
public class GenomeTest {

	@Autowired
	GenomeServicio sequenceServicio;
	
	@Test
	@DisplayName("sequence-Get-AllTest")
	  void sequenceGetAllTest() {
		String resp= sequenceServicio.getStatusGenome();
		System.out.println("HumanController.mutant()!!!!!!!!!!!! "+resp);
		boolean expected = true;
		boolean current = resp != null;
		assertEquals(expected, current);
	  }
}
