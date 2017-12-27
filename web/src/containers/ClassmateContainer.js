'use strict';
// libs
import React, {Component} from 'react'
import { CSSTransition, TransitionGroup } from 'react-transition-group'
// components
import NavHeader from '../components/common/NavHeader'
import SearchResultCard from '../components/common/card/SearchResultCard'
import Slidable from '../components/common/Slidable'
import IconMenu from "material-ui/IconMenu"
import MenuItem from 'material-ui/MenuItem'
import IconButton from 'material-ui/IconButton'

// assets
import avatar1 from '../../public/images/us_03.png'
import avatar2 from '../../public/images/us_06.png'
import avatar3 from '../../public/images/us_08.png'
import avatar4 from '../../public/images/us_10.png'
import FilterIcon from '../components/common/svg/FilterIcon'
import FemaleIcon from '../components/common/svg/FemaleIcon'
import MaleIcon from '../components/common/svg/MaleIcon'
import MixGenderIcon from '../components/common/svg/MixGenderIcon'
import HappyFaceImg from '../components/common/svg/HappyFaceImg'
import CryFaceImg from '../components/common/svg/CryFaceImg'
// styles
import {PRIMARY_BLUE, PRIMARY_GREEN, PRIMARY_RED, PRIMARY_WHITE, SECONDARY_RED} from '../styles/constants/colors'
import './ClassmateContainer.less'
import {CourseInfo, MajorInfo, StudyAbilityInfo, StudyRequirementInfo} from "../components/mainlist/ContentLists";

const hardCodeData = [
    {
        avatar: avatar1,
        name: '驴打滚',
        gender: 'female',
        age: 20,
        constellation: '处女座',
        matchRate: 0.8,
        major: 'Marketing',
        year: 'III',
        courses: ['COMM296', 'COMM294'],
        description: '我是一个学霸',
        requirements: ['自习', '上课', '同桌']
    },
    {
        avatar: avatar2,
        name: '艾窝窝',
        gender: 'male',
        age: 23,
        constellation: '天蝎座',
        major: 'Finance',
        year: 'IV',
        courses: ['COMM298', 'COMM488'],
        description: '我是一个学霸',
        requirements: ['自习', '上课']
    },
    {
        avatar: avatar3,
        name: '麻花',
        gender: 'female',
        age: 21,
        constellation: '处女座',
        matchRate: 0.8,
        major: 'Marketing',
        year: 'III',
        courses: ['COMM296', 'COMM294'],
        description: '我是一个学霸',
        requirements: ['自习', '上课', '同桌']
    },
    {
        avatar: avatar4,
        name: '红烧肉',
        gender: 'female',
        age: 19,
        constellation: '摩羯座',
        matchRate: 0.8,
        major: 'Marketing',
        year: 'V',
        courses: ['COMM296', 'COMM294'],
        description: '我是一个学霸',
        requirements: ['自习', '上课', '同桌']
    }
];

const iconStyle = {
    width: 14,
    height: 14,
    color: PRIMARY_RED
};

const CardTransition = ({ children, ...props }) => (
    <CSSTransition
        {...props}
        timeout={{enter:800, exit: 1}}
        classNames="card"
    >
        {children}
    </CSSTransition>
);

class ClassmateContainer extends Component {
    // state: 1. all data; 2. current three ones to display
    constructor(props) {
        super(props);
        this.state = {
            userPool: [],
            displayUsers: []
        };
        this.cardUpdateHandler = this.cardUpdateHandler.bind(this);
    }

    // get data
    componentDidMount() {
        this.setState({
            userPool: hardCodeData,
            displayUsers: hardCodeData.slice(0, 3)
        });
    }

    // handle card swiped
    cardUpdateHandler(index) {
        this.setState({
            displayUsers: [
                ...this.state.displayUsers.slice(0, index),
                ...this.state.displayUsers.slice(index+1, 3),
                hardCodeData[3]
            ]
        });
    }

    render() {
        return(
            <div className="classmate-container">
                <NavHeader
                    title={"找课友"}
                    color={PRIMARY_RED}
                    iconRight={
                        <IconMenu
                            iconButtonElement={<IconButton><FilterIcon color={PRIMARY_WHITE}/></IconButton>}
                            anchorOrigin={{horizontal: 'right', vertical: 'top'}}
                            targetOrigin={{horizontal: 'right', vertical: 'top'}}
                        >
                            <MenuItem primaryText={<MaleIcon color={PRIMARY_BLUE}/>} />
                            <MenuItem primaryText={<FemaleIcon color={PRIMARY_RED}/>} />
                            <MenuItem primaryText={<MixGenderIcon color={PRIMARY_GREEN}/>} />
                        </IconMenu>
                    }
                    iconRightAction={() => {}}
                />
                <TransitionGroup className="classmate-card-list">
                    {this.state.displayUsers.map(
                        (user, index) => (
                            <CardTransition key={user.name}>
                                <div className="classmate-row-wrapper">
                                    <span className="--smile">{<HappyFaceImg />}</span>
                                    <span className="--cry">{<CryFaceImg />}</span>
                                    <Slidable
                                        onFullSwipe={() => this.cardUpdateHandler(index)}
                                        element={
                                            <div className="classmate-card-list-item">
                                                <SearchResultCard
                                                    avatar={user.avatar}
                                                    name={user.name}
                                                    gender={user.gender}
                                                    age={user.age}
                                                    constellation={user.constellation}
                                                    matchRate={user.matchRate}
                                                    matchRateColor={PRIMARY_RED}
                                                    contentList={[
                                                        <MajorInfo color={PRIMARY_RED} major={user.major} year={user.year}/>,
                                                        <CourseInfo color={PRIMARY_RED} secondColor={SECONDARY_RED} courses={user.courses}/>,
                                                        <StudyAbilityInfo description={user.description}/>,
                                                        <StudyRequirementInfo color={PRIMARY_RED} secondColor={SECONDARY_RED} requirements={user.requirements}/>
                                                    ]}
                                                />
                                            </div>
                                        }
                                    />
                                </div>
                            </CardTransition>
                        )
                    )}
                </TransitionGroup>
            </div>
        )
    }
}

export default ClassmateContainer;