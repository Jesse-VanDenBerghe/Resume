package be.jessevandenberghe.resume.models

data class History(
    val title: String,
    val periods: List<HistoryPeriod>
)

data class HistoryPeriod(
    val title: String,
    val items: List<HistoryInstant>
)

data class HistoryInstant(
    val title: String,
    val from: String,
    val to: String?,
    val description: String
)