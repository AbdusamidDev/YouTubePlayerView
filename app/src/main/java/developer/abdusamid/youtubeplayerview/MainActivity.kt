package developer.abdusamid.youtubeplayerview

import android.os.Bundle
import android.view.View
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import uz.ilhomjon.youtube2022.R


class MainActivity : YouTubeBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val youTubePlayerView = findViewById<View>(R.id.player) as YouTubePlayerView

        youTubePlayerView.initialize("AIzaSyDapzdS613VLOcnN7ZWm8EccjwIFo4qkX4",
            object : YouTubePlayer.OnInitializedListener {
                override fun onInitializationSuccess(
                    provider: YouTubePlayer.Provider,
                    youTubePlayer: YouTubePlayer, b: Boolean,
                ) {

                    // do any work here to cue video, play video, etc.
                    youTubePlayer.cueVideo("5xVh-7ywKpE")
                }

                override fun onInitializationFailure(
                    provider: YouTubePlayer.Provider,
                    youTubeInitializationResult: YouTubeInitializationResult,
                ) {
                }
            })
    }
}