import request from '@/utils/request'

// 查询线索列表
export function listClue(query) {
  return request({
    url: '/crm/clue/list',
    method: 'get',
    params: query
  })
}

// 查询线索详细
export function getClue(id) {
  return request({
    url: '/crm/clue/' + id,
    method: 'get'
  })
}

// 新增线索
export function addClue(data) {
  return request({
    url: '/crm/clue',
    method: 'post',
    data: data
  })
}

// 修改线索
export function updateClue(data) {
  return request({
    url: '/crm/clue',
    method: 'put',
    data: data
  })
}

// 删除线索
export function delClue(id) {
  return request({
    url: '/crm/clue/' + id,
    method: 'delete'
  })
}
