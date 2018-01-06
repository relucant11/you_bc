'use strict';

import React from 'react';

const CheckIcon = (props) => (
    <img
        {...props}
        width={86} height={86}
        src="data:img/png;base64,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"
    />
);

export default CheckIcon;