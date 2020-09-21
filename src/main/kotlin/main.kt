package com.github.awilliams17.redcord
import org.javacord.api.DiscordApiBuilder
import com.vdurmont.emoji.EmojiParser


// Things to consider:
// * What if emojis are disabled?
// * Is there a rate limit on emojis?
fun main(args : Array<String>) {
    val token = args[0] // TODO: If this is going to use program arguments instead of a config - need to do this better.
    val discordApi = DiscordApiBuilder().setToken(token).login().join()

    discordApi.addMessageCreateListener { event ->
        event.message.addReaction(EmojiParser.parseToUnicode(":arrow_up:"))
    }

    println(discordApi.createBotInvite())
}
