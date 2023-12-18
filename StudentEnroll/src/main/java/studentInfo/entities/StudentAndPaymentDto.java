package studentInfo.entities;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class StudentAndPaymentDto {

//	@NotBlank(message = "name is required")
//	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "name should contain only letters and spaces")
	private String studentName;
//	@NotBlank(message = "Email cannot be blank")
//	@Email(message = "Invalid email format")
	private String email;
//	@NotBlank(message = "Mobile number cannot be blank")
//	@Pattern(regexp = "^\\d{10}$", message = "mobile number must be 10 digits")
	private String mobile;
	private Integer batchId;
//	@NotNull(message = "Dateofjoining must be required")
	private LocalDate date;
//	@NotNull(message = "Amount cannot be null")
	private Double amount;
//	@NotNull(message = "Paydate must be required")
	private LocalDate payDate;
//	@NotNull(message = "PayMode must be given")
	private char payMode;

	public StudentAndPaymentDto(String studentName, String email, String mobile, Integer batchId, LocalDate date,
			Double amount, LocalDate payDate, char payMode) {
		super();
		this.studentName = studentName;
		this.email = email;
		this.mobile = mobile;
		this.batchId = batchId;
		this.date = date;
		this.amount = amount;
		this.payDate = payDate;
		this.payMode = payMode;
	}

	public StudentAndPaymentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentName() {
		return studentName;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getAmount() {
		return amount;
	}

	public LocalDate getPayDate() {
		return payDate;
	}

	public char getPayMode() {
		return payMode;
	}

}
