package com.therapy.connect.review.service.therapist;

import com.therapy.connect.review.entity.TherapistReviewEntity;
import com.therapy.connect.review.mapper.therapist.TherapistReviewMapper;
import com.therapy.connect.review.model.TherapistReview;
import com.therapy.connect.review.repository.TherapistReviewRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@RequiredArgsConstructor
@Service
class DefaultTherapistReviewService implements ITherapistReviewService {

    private final TherapistReviewRepository repository;
    private final TherapistReviewMapper mapper;

    @Override
    public @NonNull Collection<TherapistReview> findAll() {
        return repository.findAll().stream()
                .map(mapper::convert)
                .toList();
    }

    @Override
    public @NonNull TherapistReview findById(@NonNull UUID id) {
        return repository.findById(id)
                .map(mapper::convert)
                .orElseThrow();
    }

    @Override
    public @NonNull TherapistReview save(@NonNull TherapistReview review) {
        TherapistReviewEntity therapistReviewToSave = mapper.convert(review);
        TherapistReviewEntity savedTherapistReview = repository.save(therapistReviewToSave);
        return mapper.convert(savedTherapistReview);
    }

    @Override
    public @NonNull TherapistReview update(@NonNull TherapistReview review) {
        TherapistReviewEntity therapistReviewToUpdate = mapper.convert(review);
        TherapistReviewEntity updatedTherapistReview = repository.save(therapistReviewToUpdate);
        return mapper.convert(updatedTherapistReview);
    }

    @Override
    public void deleteById(@NonNull UUID id) {
        repository.deleteById(id);
    }
}
