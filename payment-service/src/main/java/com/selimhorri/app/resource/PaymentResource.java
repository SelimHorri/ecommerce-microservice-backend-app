package com.selimhorri.app.resource;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.app.dto.PaymentDto;
import com.selimhorri.app.dto.response.collection.DtoCollectionResponse;
import com.selimhorri.app.service.PaymentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/payments")
@Slf4j
@RequiredArgsConstructor
public class PaymentResource {
	
	private final PaymentService paymentService;
	
	@GetMapping
	public ResponseEntity<DtoCollectionResponse<PaymentDto>> findAll() {
		log.info("*** PaymentDto List, controller; fetch all payments *");
		return ResponseEntity.ok(new DtoCollectionResponse<>(this.paymentService.findAll()));
	}
	
	@GetMapping("/{paymentId}")
	public ResponseEntity<PaymentDto> findById(
			@PathVariable("paymentId") 
			@NotBlank(message = "Input must not be blank") 
			@Valid final String paymentId) {
		log.info("*** PaymentDto, resource; fetch payment by id *");
		return ResponseEntity.ok(this.paymentService.findById(Integer.parseInt(paymentId)));
	}
	
	@PostMapping
	public ResponseEntity<PaymentDto> save(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final PaymentDto paymentDto) {
		log.info("*** PaymentDto, resource; save payment *");
		return ResponseEntity.ok(this.paymentService.save(paymentDto));
	}
	
	@PutMapping
	public ResponseEntity<PaymentDto> update(
			@RequestBody 
			@NotNull(message = "Input must not be NULL") 
			@Valid final PaymentDto paymentDto) {
		log.info("*** PaymentDto, resource; update payment *");
		return ResponseEntity.ok(this.paymentService.update(paymentDto));
	}
	
	@DeleteMapping("/{paymentId}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("paymentId") final String paymentId) {
		log.info("*** Boolean, resource; delete payment by id *");
		this.paymentService.deleteById(Integer.parseInt(paymentId));
		return ResponseEntity.ok(true);
	}
	
	
	
}










