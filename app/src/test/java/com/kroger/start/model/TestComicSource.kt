package com.kroger.start.model

class TestComicSource {

    fun getSingleComic(): Comic {
        return Comic(
            "2",
            221,
            "",
            "2007",
            "",
            "Random Number",
            "int getRandomNumber()\\n{\\n  return 4; \\n chosen by fair dice roll.\\n               \\n guarenteed to be random.\\n}\\n{{title text: RFC 1149.5 specifies 4 as the standard IEEE-vetted random number.}}",
            "RFC 1149.5 specifies 4 as the standard IEEE-vetted random number.",
            "https://imgs.xkcd.com/comics/random_number.png",
            "Random Number",
            day = "9",
        )
    }

    fun getSeveralComics(): Collection<Comic> {
        return listOf(
            Comic(
                "3",
                2439,
                "",
                "2021",
                "",
                "Solar System Cartogram",
                "",
                "For sentimental reasons, every active Mars rover is counted as one person, although that's not enough to make Mars more than a dot.",
                "https://imgs.xkcd.com/comics/solar_system_cartogram.png",
                "Solar System Cartogram",
                day = "19",
            ),
            Comic(
                "10",
                323,
                "",
                "2007",
                "",
                "Ballmer Peak",
                "[[A graph with \\\"programming skill\\\" on the X-axis and \\\"blood alcohol concentration\\\" on the Y one]]\\n[[A man is making a presentation with the graph]]\\nPresenter: Called the Ballmer Peak, it was discovered by Microsoft in the 80's. The cause is unknown but somehow a B.A.C between 0.129% and 0.138% confers superhuman programming ability.\\nPresenter: However, it's a delicate effect requiring careful calibration--you can't just give a team of coders a year's supply of whiskey and tell them to get cracking.\\nMan in public: ...Has that ever happened.\\nPresenter: Remember Windows ME?\\nMan: I knew it!\\n{{title text: Apple uses automated schnapps IVs.}}\"",
                "Apple uses automated schnapps IVs.",
                "https://imgs.xkcd.com/comics/ballmer_peak.png",
                "Ballmer Peak",
                day = "1",
            ),
            Comic(
                "1",
                1471,
                "",
                "2015",
                "",
                "Gut Fauna",
                "[[A doctor reading a clipboard consults a patient sitting on an examination table.]]\\nDoctor: I see the problem. Your gut macrobiome is out of balance.\\nDoctor: One moment.\\n\\n[[Doctor walks off-panel]]\\nPatient: I think you mean MICRObiome.\\nPatient: ..right?\\n\\n[[Doctor returns slightly rumpled and carrying a wolf.]]\\nDoctor: No. Here, swallow this.\\nPatient: That's a wolf.\\nDoctor: Do you need a glass of water?\\n\\n{{Title text: I know it seems unpleasant, but of the two ways we typically transfer them, I promise this is the one you want.}}\\n\\n",
                "I know it seems unpleasant, but of the two ways we typically transfer them, I promise this is the one you want.",
                "https://imgs.xkcd.com/comics/gut_fauna.png",
                "Gut Fauna",
                day = "9",
            )
        )
    }
}
