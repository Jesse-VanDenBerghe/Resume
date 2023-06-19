package be.jessevandenberghe.resume.models

data class History(
    val title: String,
    val periods: List<HistoryPeriod>
)

data class HistoryPeriod(
    val title: String,
    val location: String,
    val items: List<HistoryInstant>
)

data class HistoryInstant(
    val title: String,
    val from: String,
    val until: String?,
    val description: String?
){
    val periodString by lazy {
        "$from - ${until ?: "Present"}"
    }
}