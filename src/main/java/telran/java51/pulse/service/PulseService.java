package telran.java51.pulse.service;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.java51.pulse.dto.PulseDTO;

@Configuration
public class PulseService {
	
	Random random = new Random();
	private int minId = 1;
	private int maxId = 10;
	private int minPulse = 1;
	private int maxPulse = 200;
	
	@Bean
	Supplier<PulseDTO> sendData() {
		return () -> {
			int id = random.nextInt(minId, maxId);
			long timestamp = System.currentTimeMillis();
			int payload = random.nextInt(minPulse, maxPulse);
			return new PulseDTO(id, timestamp, payload);
		};
	}

}
