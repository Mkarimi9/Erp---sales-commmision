
//import { render } from '@testing-library/react';
import { Component } from 'react';
import './App.css';
import {getAllEmployees} from './Client'
import {
  Table
} from 'antd';

class App extends Component {
  state = {
    employees: []
  }

  componentDidMount () {
    this.fetchEmployees();
  }


  fetchEmployees = () => {
    getAllEmployees()
    .then(res => res.json()
    .then(employees => {
      console.log(employees);
      this.setState({
        employees
      });
    }));
  }
  render(){
  //const {employees} = this.state;
  if(this.state.employees && this.state.employees.length){
    const columns = [
      {
        title: 'Employee ID',
        dataIndex: 'id',
        key: 'id'
      },
      {
        title: 'Employee Name',
        dataIndex: 'name',
        key: 'name'
      },
      {
        title: 'Employee Email',
        dataIndex: 'email',
        key: 'email'
      }
    ];
    return ( <Table 
      dataSource = {this.state.employees}
      columns = {columns}
      rowKey = 'id'/>
    );
  }
  return (
    
    <h1> No Employees</h1>
  );
  }
}

export default App;
