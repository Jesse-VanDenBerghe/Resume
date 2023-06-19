package be.jessevandenberghe.resume.seeds.me

import be.jessevandenberghe.resume.R
import be.jessevandenberghe.resume.models.Link

internal val MyResume.Companion.Links: List<Link>
    get() = listOf(
        Link(
            icon = R.drawable.ic_linkedin,
            name = "LinkedIn",
            link = "https://www.linkedin.com/in/jessevandenberghe/"
        ),
        Link(
            icon = R.drawable.ic_github,
            name = "Github",
            link = "https://github.com/Jesse-VanDenBerghe"
        )/*,
        Link(
            icon = R.drawable.ic_instagram,
            name = "Instagram",
            link = "https://www.instagram.com/jessevandenberghe/"
        )*/
    )