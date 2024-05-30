# Android-Interview-Test

This is a programming skills test for potential Android developers. This project is the skeleton of
an app to display [XKCD comics](https://xkcd.com/). It needs the a few missing parts created to
actually fetch and display comic images.

##  Pre-interview Setup

Please do all of the following before the interview:
1. Read through this README entirely
2. Open this project in Android Studio
3. Install the Android SDK version used for this project (SDK level 34)
4. Build and run the app target
5. Look over the existing code
6. Please wait until the interview begins to start writing code

## Your Task

To begin, make a network call to get the most recent comic, and then display that comic's details
using `ComicFragment` for an xml based view, or `ComicScreen` for a compose based view. In the UI, be sure to include:

- The comic's title
- The rendered comic image
- The comic's alt text

This screenshot shows an example of what we're going for:
![Screenshot_1616010306](https://user-images.githubusercontent.com/51245997/111528686-d74c8780-8737-11eb-879f-e803d684d5ba.png)

You may use any 3rd party tools to finish this app, but there are a number of libraries already
included in the project for convenience. Making use of these pre-included libraries is optional:

- Dagger Hilt, with several classes already bound to the graph
- A networking stack with Retrofit, OkHttp, and Moshi
- Glide image loader (XML)
- Coil image loader (Compose)
- Android ViewModels, Lifecycle, and LiveData (KTX versions)
- Kotlin Coroutines Android
- RxAndroid 3 (and thus RxJava 3 also)

Feel free to reference any outside documentation during the test.

## XKCD's Comic API

XKCD has a [simple API](https://xkcd.com/json.html):

> If you want to fetch comics and metadata automatically,
> you can use the JSON interface. The URLs look like this:
>
> https://xkcd.com/info.0.json (current comic)
>
> or:
>
> https://xkcd.com/614/info.0.json (comic #614)
>
> Those files contain, in a plaintext and easily-parsed format: comic titles,
> URLs, post dates, transcripts (when available), and other metadata.

Here's an example response body:

```json
{
  "month": "3",
  "num": 2437,
  "link": "",
  "year": "2021",
  "news": "",
  "safe_title": "Post-Vaccine Party",
  "transcript": "",
  "alt": "[Future update] Well, someone accidentally dropped an M&M in their cup of ice water, and we all panicked and scattered.",
  "img": "https://imgs.xkcd.com/comics/post_vaccine_party.png",
  "title": "Post-Vaccine Party",
  "day": "15"
}
```
