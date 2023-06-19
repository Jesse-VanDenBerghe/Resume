package be.jessevandenberghe.resume.seeds.me

import be.jessevandenberghe.resume.models.History
import be.jessevandenberghe.resume.models.HistoryInstant
import be.jessevandenberghe.resume.models.HistoryPeriod

internal val MyResume.Companion.Employment: History
    get() = History(
        title = "Employment history",
        periods = listOf(
            HistoryPeriod(
                title = "Wisemen (Appwise)",
                location = "Diepenbeek, Belgium",
                items = listOf(
                    HistoryInstant(
                        title = "Squad lead",
                        from = "Aug 2022",
                        until = null,
                        description = "As a squad lead, I successfully led a team in the development and management of multiple projects concurrently. My responsibilities encompassed client communication, team planning, budget estimations, and scope management."
                    ),
                    HistoryInstant(
                        title = "Android lead",
                        from = "June 2020",
                        until = null,
                        description = "I was entrusted with the responsibility of keeping our Android knowledge up to date throughout the entire company. This involved leading bi-weekly meetings to share information, conduct research, coach interns, and deliver workshops."
                    ),
                    HistoryInstant(
                        title = "Android Developer",
                        from = "Sep 2018",
                        until = null,
                        description = "Worked on or completely developed over 20 Android apps for multiple clients, with some of them reaching over 50k downloads in the store. These apps were complete projects, from design to publishing on the Play Store. " +
                                "Throughout their lifecycle in the store, I also provided maintenance support and implemented feature updates for these apps."
                    ),
                    HistoryInstant(
                        title = "Android Developer (Intern)",
                        from = "Feb 2018",
                        until = "Sep 2018",
                        description = "A mobile app that utilizes Optical Character Recognition (OCR) to scan ID cards using the camera. " +
                                "During this internship, I also conducted a comparative study between Android development in Kotlin and Java. This study played a crucial role in the decision to transition to Kotlin for future projects within the company."
                    ),
                    HistoryInstant(
                        title = "Android Developer (Student)",
                        from = "Aug 2017",
                        until = "Feb 2018",
                        description = "Learning the basics of Android, my first test application was an implementation of the Tesla API, allowing me to use the phone as a wireless key fob. Building on this initial success, I then had the opportunity to contribute to various production projects."
                    ),
                )
            )
        )
    )

internal val MyResume.Companion.Education: History
    get() = History(
        title = "Education",
        periods = listOf(
            HistoryPeriod(
                title = "Hogeschool PXL",
                location = "Hasselt, Belgium",
                items = listOf(
                    HistoryInstant(
                        title = "Applied IT (Application Development)",
                        from = "2015",
                        until = "2018",
                        description = null
                    )
                )
            ),
            HistoryPeriod(
                title = "UHasselt",
                location = "Diepenbeek, Belgium",
                items = listOf(
                    HistoryInstant(
                        title = "IT",
                        from = "2013",
                        until = "2015",
                        description = "(unfinished)"
                    )
                )
            )
        )
    )