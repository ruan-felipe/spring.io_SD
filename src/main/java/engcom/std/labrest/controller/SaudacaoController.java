package engcom.std.labrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import engcom.std.labrest.resources.Saudacao;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaudacaoController {
	private static final String MENSAGEM = "Olá %s";
	private final AtomicLong contador = new AtomicLong();

	@GetMapping("/saudacao")
	public Saudacao saudacao (@RequestParam(value = "nome", defaultValue = "mundo") String nome){
		return new Saudacao(contador.incrementAndGet(), String.format(MENSAGEM, nome));
	}
}