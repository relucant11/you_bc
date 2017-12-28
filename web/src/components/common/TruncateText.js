'use strict';

import React, {Component} from 'react';
import PropTypes from 'prop-types';
import DropDownIcon from 'material-ui/svg-icons/navigation/arrow-drop-down';
import DropUpIcon from 'material-ui/svg-icons/navigation/arrow-drop-up';
import './TruncateText.less';

class TruncateText extends Component {
    constructor(props) {
        super(props);
        this.state = {
            expanded: false
        };
        this.clickHandler = this.clickHandler.bind(this);
    }

    clickHandler() {
        this.setState({expanded: ! this.state.expanded});
    }

    render() {
        let visibleText = null;
        let expandable = this.props.text.length > this.props.maxLength;
        if (this.state.expanded || !expandable) {
            visibleText = this.props.text;
        } else {
            const firstLine = this.props.text.substring(0, this.props.maxLength);
            visibleText = `${firstLine}...`;
        }
        let Arrow = this.state.expanded ?  <DropUpIcon/> : <DropDownIcon/>;
        return (
            <div style={this.props.style} className="truncate-text" onClick={this.clickHandler}>
                <div style={this.props.textStyle}>{visibleText}</div>
                {expandable &&  Arrow}
            </div>
        );
    }
}

TruncateText.propTypes = {
    text: PropTypes.string.isRequired,
    maxLength: PropTypes.number,
    style: PropTypes.object,
    textStyle: PropTypes.object
};

TruncateText.defaultProps = {
    maxLength: 11,
    style: {},
    textStyle: {}
};

export default TruncateText;