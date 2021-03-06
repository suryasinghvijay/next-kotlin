package com.junnanhao.next.player

import com.junnanhao.next.data.model.Song

/**
 * Created by Jonas on 2017/5/26.
 * define interfaces of player
 */
interface IPlayer {
    fun play(): Boolean
    fun play(song: Song): Boolean
    fun pause(): Boolean
    fun complete(): Boolean
    fun isPlaying(): Boolean
    fun getProgress(): Int
    fun getPlayingSong(): Song?
    fun seekTo(position: Int): Boolean
    fun release()
    fun duck()
}