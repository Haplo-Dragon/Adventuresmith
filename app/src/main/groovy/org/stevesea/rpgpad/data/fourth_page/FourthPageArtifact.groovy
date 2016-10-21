/*
 * Copyright (c) 2016 Steve Christensen
 *
 * This file is part of RPG-Pad.
 *
 * RPG-Pad is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RPG-Pad is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RPG-Pad.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.stevesea.rpgpad.data.fourth_page

import org.stevesea.rpgpad.data.AbstractGenerator

class FourthPageArtifact extends AbstractGenerator {
    Map<String,List<String>> origins = [
            'Holy' : '''\
It's been lost for centuries.
It once belonged to a dark god.
It was made for a holy quest.
It's faithful to you and your cause.
You must prove yourself to it.
They want it back.\
'''.readLines(),
            'Magic': '''\
It's covered in mysterious runes.
It's powered by a trapped soul.
You must speak the proper words.
It's charges are running low.
It's a piece of something bigger.
The focus crystal needs replacing.\
'''.readLines(),
            'Masterwork' : '''\
It was forged by dwarven blacksmiths.
Elven weavers put years into its making.
No demon lord fights without one.
It's infused with a drop of dragon blood.
It's in mint condition.
It's the best a human could do.\
'''.readLines(),
            'Natural': '''\
It breathes and pulses in your hand.
It requires sustenance.
It bonds to your flesh.
It's starting its metamorphosis.
It glows in the dark.
It followed you home.\
'''.readLines(),
            'Otherworldly' : '''\
It's decidedly non-euclidean.
It's silicon-based life.
It hurts to look at it.
It's goopy.
It's bigger on the inside.
It's made from meteoric iron.\
'''.readLines(),
            'Technological': '''\
Its gears click and whiz.
It jams at the worst times.
Sparks fly in all directions.
It's a one-of-a-kind prototype.
It leaks acid all over you.
It needs reloading after every use.\
'''.readLines()
    ]
    Map<String,List<String>> powers = [
            'Blessing' :  '''\
You see visions of the future.
You move unseen.
You've had fantastic luck lately.
You sense lies and deception.
Disease cannot touch you.
Dark entities fear you.\
'''.readLines(),
            'Curse' : '''\
You're plagued by terrible nightmares.
You've been polymorphed.
Your thoughts are not your own.
You've lost your voice.
You're aging rapidly.
The stink just won't wash off.\
'''.readLines(),
            'Enhancement' : '''\
You have the might of the giants.
You're as agile as the wind.
You feel healthier than ever.
Your mind is filled with knowledge.
Your senses are heightened.
Your charm is irresistible.\
'''.readLines(),
            'Force': '''\
It shoots gouts of flame.
You shock your foes with lightning.
The wind obeys your call.
Thunderous sound blasts your enemies.
You control illusory phantasms.
You freeze your target in place.\
'''.readLines(),
            'Protection' :  '''\
You are immune to the elements.
You skin is as hard as stone.
It cloaks you in shadow.
It fights at your side.
You're as steady as a mountain.
It heals your wounds.\
'''.readLines(),
            'Utility' : '''\
It provides a brilliant light.
You can command simple beasts.
You breathe water as if it were air.
You can teleport short distances.
You understand foreign languages.
You see and hear over vast distances.\
'''.readLines()
            ]

    @Override
    String generate() {
        String originKey = pick(origins.keySet())
        String powerKey = pick(powers.keySet())
        """\
<h4>Artifact</h4>
<h5>Origin</h5>
<strong><small>${originKey}</small></strong> - ${pick(origins.get(originKey))}
<h5>Power</h5>
<strong><small>${powerKey}</small></strong> - ${pick(powers.get(powerKey))}
"""
    }
}
