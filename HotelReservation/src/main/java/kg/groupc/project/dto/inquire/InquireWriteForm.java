package kg.groupc.project.dto.inquire;

import java.sql.Date;

import org.modelmapper.ModelMapper;

import kg.groupc.project.entity.account.Account;
import kg.groupc.project.entity.hotel.Hotel;
import kg.groupc.project.entity.inquire.Inquire;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InquireWriteForm {
	private String category; // 카테고리
	private Hotel hotel; // 호텔코드
	private String title; // 제목
	private Account writer; // 작성자
	private String description; // 내용
	private Date day; // 등록일
	private Long status; // 처리상태
	
	private static ModelMapper modelMapper = new ModelMapper();
	
	public static Inquire of (Inquire inquire) {
		return modelMapper.map(inquire, Inquire.class);
	}
	
	public Inquire toEntity() {
		Inquire inquire = Inquire.builder()
				.title(title)
				.category(category)
				.writer(writer)
				.hotel(hotel)
				.day(day)
				.description(description)
				.status(status)
				.build();
		return inquire;
	}
	
	@Builder
	public InquireWriteForm(Long seq, String category, Hotel hotel, String title, String description, Account writer, Date day, Long status) {
		this.category = category;
		this.hotel = hotel;
		this.title = title;
		this.description = description;
		this.writer = writer;
		this.day = day;
		this.status = status;
	}
}
