package com.dulich.toudulich.responses;

import com.dulich.toudulich.Model.BookingModel;
import com.dulich.toudulich.Model.UserModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingResponse{
    int id ;

    int userId ;

    @JsonProperty("full_name")
    String fullName;

    @JsonProperty("phone_number")
    String phoneNumber;

    @JsonProperty("tour_name")
    String tourName;

    float amount;

    @JsonProperty("start_date")
    Date startDate;

    @JsonProperty("total_price")
    float totalPrice;

    String status;

    @JsonProperty("payment_method")
    String paymentMethod;

    String notes;

    @JsonProperty("booking_time")
    LocalDateTime bookingTime;

    public static BookingResponse fromBooking(BookingModel booking) {
        BookingResponse bookingResponse = BookingResponse.builder()
                .id(booking.getId())
                .userId(booking.getUserModel().getId())
                .fullName(booking.getFullName())
                .phoneNumber(booking.getPhoneNumber())
                .tourName(booking.getTourName())
                .startDate(booking.getStartDate())
                .amount(booking.getAmount())
                .totalPrice(booking.getTotalPrice())
                .status(booking.getStatus())
                .notes(booking.getNotes())
                .bookingTime(booking.getBookingTime())
                .build();
        return bookingResponse;
    }
}
