fun main() {
    val signalcase_1 = Signal(84, 85, 26, 12, 5)
    check(Policy.score(signalcase_1) == 156)
    check(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(62, 94, 16, 12, 12)
    check(Policy.score(signalcase_2) == 162)
    check(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(72, 92, 22, 18, 7)
    check(Policy.score(signalcase_3) == 123)
    check(Policy.classify(signalcase_3) == "review")
    val domainReview = DomainReview(80, 33, 10, 61)
    check(DomainReviewLens.score(domainReview) == 224)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
