package com.therapy.connect.review.controller;

import com.therapy.connect.review.dto.command.therapist.CreateTherapistReviewCommand;
import com.therapy.connect.review.dto.command.therapist.UpdateTherapistReviewCommand;
import com.therapy.connect.review.dto.view.TherapistReviewView;
import com.therapy.connect.review.mapper.therapist.TherapistReviewCommandMapper;
import com.therapy.connect.review.mapper.therapist.TherapistReviewViewMapper;
import com.therapy.connect.review.model.TherapistReview;
import com.therapy.connect.review.service.therapist.ITherapistReviewService;
import com.therapy.connect.util.constants.ProjectConstants;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

@RequiredArgsConstructor
@Validated
@RestController
@RequestMapping(ProjectConstants.REVIEW_SERVICE_BASE_PATH + "/therapist-review")
final class TherapistReviewController {

    private final ITherapistReviewService therapistReviewService;
    private final TherapistReviewCommandMapper therapistReviewCommandMapper;
    private final TherapistReviewViewMapper therapistReviewViewMapper;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public Collection<TherapistReviewView> getTherapistReviews() {
        return therapistReviewService.findAll().stream()
                .map(therapistReviewViewMapper::convert)
                .toList();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public TherapistReviewView getById(@PathVariable UUID id) {
        TherapistReview therapistReview = therapistReviewService.findById(id);
        return therapistReviewViewMapper.convert(therapistReview);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public TherapistReviewView save(@Valid @RequestBody CreateTherapistReviewCommand command) {
        TherapistReview therapistReview = therapistReviewCommandMapper.convert(command);
        TherapistReview savedTherapistReview = therapistReviewService.save(therapistReview);
        return therapistReviewViewMapper.convert(savedTherapistReview);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping
    public TherapistReviewView update(@Valid @RequestBody UpdateTherapistReviewCommand command) {
        TherapistReview therapistReview = therapistReviewCommandMapper.convert(command);
        TherapistReview updatedTherapistReview = therapistReviewService.update(therapistReview);
        return therapistReviewViewMapper.convert(updatedTherapistReview);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        therapistReviewService.deleteById(id);
    }
}
