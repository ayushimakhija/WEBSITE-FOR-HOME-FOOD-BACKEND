import React from "react";
import Entry from "./Entry";
import emojipedia from "./emojipedia"


function createRepeated(detail)
{
    return (<Entry
        key={detail.id}
        emo={detail.emoji}
        term={detail.name}
        des={detail.meaning}

    />);
}

function Boxes(emojipedia) {
    return (
        <div>
            <h1>
                <span></span>
            </h1>
            <dl className="dictionary">
                { emojipedia.map(createRepeated)};
            </dl>
        </div>
    );
}

export default Boxes;
