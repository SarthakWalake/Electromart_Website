package com.electromart.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electromart.api.model.Booking;
import com.electromart.api.repository.BookingRepository;

@Service
public class BookingService {
    
    @Autowired
    private BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking)
    {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings()
    {
        return bookingRepository.findAll();
    }

    public void deleteBooking(String id)
    {
        bookingRepository.deleteById(id);
    }
}
